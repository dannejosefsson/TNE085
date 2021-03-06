/* Automatically generated nanopb header */
/* Generated by nanopb-0.1.7-dev at Sun Dec  2 17:38:28 2012. */

#ifndef _PB_COMMAND_PB_H_
#define _PB_COMMAND_PB_H_
#include <pb.h>

#ifdef __cplusplus
extern "C" {
#endif

/* Enum definitions */
/* Struct definitions */
typedef struct _DriveSignals {
    bool forward;
    bool enable;
    uint32_t power;
} DriveSignals;

typedef struct _I2CSensorData {
    char type[40];
    char description[40];
    uint32_t address;
    uint32_t value;
} I2CSensorData;

typedef struct _USSensorData {
    char type[40];
    char description[40];
    uint32_t echopin;
    uint32_t triggerpin;
    uint32_t value;
} USSensorData;

typedef struct _accelerometerData {
    uint32_t x_value;
    uint32_t y_value;
    uint32_t z_value;
} accelerometerData;

typedef struct _Engines {
    DriveSignals right;
    DriveSignals left;
} Engines;

typedef struct _I2CSensors {
    I2CSensorData i2CSensorData1;
    I2CSensorData i2CSensorData2;
    I2CSensorData i2CSensorData3;
    I2CSensorData i2CSensorData4;
    I2CSensorData i2CSensorData5;
} I2CSensors;

typedef struct _USSensors {
    USSensorData uSSensorData1;
    USSensorData uSSensorData2;
    USSensorData uSSensorData3;
    USSensorData uSSensorData4;
} USSensors;

/* Default values for struct fields */

/* Struct field encoding specification for nanopb */
extern const pb_field_t accelerometerData_fields[4];
extern const pb_field_t USSensorData_fields[6];
extern const pb_field_t I2CSensorData_fields[5];
extern const pb_field_t DriveSignals_fields[4];
extern const pb_field_t Engines_fields[3];
extern const pb_field_t USSensors_fields[5];
extern const pb_field_t I2CSensors_fields[6];

/* Check that field information fits in pb_field_t */
#if !defined(PB_FIELD_16BIT) && !defined(PB_FIELD_32BIT)
STATIC_ASSERT((pb_membersize(Engines, right) < 256 && pb_membersize(Engines, left) < 256 && pb_membersize(USSensors, uSSensorData1) < 256 && pb_membersize(USSensors, uSSensorData2) < 256 && pb_membersize(USSensors, uSSensorData3) < 256 && pb_membersize(USSensors, uSSensorData4) < 256 && pb_membersize(I2CSensors, i2CSensorData1) < 256 && pb_membersize(I2CSensors, i2CSensorData2) < 256 && pb_membersize(I2CSensors, i2CSensorData3) < 256 && pb_membersize(I2CSensors, i2CSensorData4) < 256 && pb_membersize(I2CSensors, i2CSensorData5) < 256), YOU_MUST_DEFINE_PB_FIELD_16BIT)
#endif

#if !defined(PB_FIELD_32BIT)
STATIC_ASSERT((pb_membersize(Engines, right) < 65536 && pb_membersize(Engines, left) < 65536 && pb_membersize(USSensors, uSSensorData1) < 65536 && pb_membersize(USSensors, uSSensorData2) < 65536 && pb_membersize(USSensors, uSSensorData3) < 65536 && pb_membersize(USSensors, uSSensorData4) < 65536 && pb_membersize(I2CSensors, i2CSensorData1) < 65536 && pb_membersize(I2CSensors, i2CSensorData2) < 65536 && pb_membersize(I2CSensors, i2CSensorData3) < 65536 && pb_membersize(I2CSensors, i2CSensorData4) < 65536 && pb_membersize(I2CSensors, i2CSensorData5) < 65536), YOU_MUST_DEFINE_PB_FIELD_32BIT)
#endif

#ifdef __cplusplus
} /* extern "C" */
#endif

#endif
