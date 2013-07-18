#include <iostream>
#include <fstream>

#include <ASN1Types.hh>

#include <DERValueReader.hh>

int main()
{
   std::ifstream file("d:\\cmp_ir.bin", std::ios::binary);

   file.seekg(0, std::ios::end);
   int length = file.tellg();
   file.seekg(0, std::ios::beg);

   char* data = new char[length];

   file.read(data, length);
   file.close();


/*   uint8_t data[] = {
   0x30, 0x81,
0xe4, 0x30, 0x72, 0x02, 0x01, 0x02, 0xa0, 0x0a, 0x30, 0x08, 0x06, 0x02, 0x2a, 0x03, 0xa0, 0x02,
0x05, 0x00, 0xa5, 0x0c, 0x30, 0x0a, 0xa0, 0x03, 0x13, 0x01, 0x31, 0xa1, 0x03, 0x1e, 0x01, 0x31,
0xa1, 0x07, 0x30, 0x05, 0x06, 0x03, 0x2a, 0x86, 0x48, 0xa2, 0x04, 0x04, 0x02, 0x31, 0x31, 0xa3,
0x06, 0x04, 0x04, 0x30, 0x30, 0x31, 0x30, 0xa4, 0x09, 0x04, 0x07, 0x31, 0x32, 0x31, 0x33, 0x31,
0x32, 0x31, 0xa5, 0x04, 0x04, 0x02, 0x31, 0x35, 0xa6, 0x04, 0x04, 0x02, 0x31, 0x34, 0xa7, 0x16,
0x30, 0x14, 0x0c, 0x03, 0x31, 0x32, 0x31, 0x0c, 0x06, 0x31, 0x32, 0x33, 0x34, 0x35, 0x35, 0x0c,
0x05, 0x34, 0x32, 0x31, 0x31, 0x32, 0xa8, 0x0d, 0x30, 0x0b, 0x30, 0x09, 0x06, 0x05, 0x2a, 0x01,
0x01, 0x01, 0x02, 0x05, 0x00, 0xa0, 0x6e, 0x30, 0x6c, 0x30, 0x6a, 0x30, 0x3f, 0x02, 0x01, 0x02,
0x30, 0x3a, 0xa3, 0x0b, 0x30, 0x09, 0x31, 0x07, 0x30, 0x05, 0x06, 0x01, 0x29, 0x05, 0x00, 0xa5,
0x0c, 0x30, 0x0a, 0x31, 0x08, 0x30, 0x06, 0x06, 0x02, 0x2a, 0x03, 0x05, 0x00, 0xa6, 0x0b, 0x30,
0x05, 0x06, 0x03, 0x2a, 0x86, 0x48, 0x03, 0x02, 0x05, 0xe0, 0xa9, 0x10, 0x30, 0x0e, 0x06, 0x03,
0x28, 0x01, 0x02, 0x04, 0x07, 0x30, 0x31, 0x31, 0x31, 0x31, 0x30, 0x31, 0xa1, 0x27, 0xa0, 0x1a,
0x30, 0x0b, 0x30, 0x05, 0x06, 0x03, 0x2a, 0x86, 0x48, 0x03, 0x02, 0x05, 0xa0, 0x30, 0x0b, 0x30,
0x05, 0x06, 0x03, 0x2a, 0x86, 0x48, 0x03, 0x02, 0x05, 0x40, 0x30, 0x05, 0x06, 0x03, 0x2a, 0x86,
0x48, 0x03, 0x02, 0x02, 0xf4
   };*/

   asn1::BERBuffer buf((uint8_t*) data, length);

   try
   {
      asn1::generated::PKIMessage type;
      asn1::generated::PKIMessage::ValueType value;

      asn1::DERValueReader reader(buf);
      type.read(reader, value);
   }
   catch (asn1::ASN1Exception& e)
   {
      std::cout << "error: " << e.what() << std::endl;
   }

   //delete[] data;

   return 0;
}
