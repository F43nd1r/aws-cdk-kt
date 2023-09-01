package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWirelessDeviceImportTask(
  id: String,
  props: CfnWirelessDeviceImportTaskProps,
  initializer: @AwsCdkDsl CfnWirelessDeviceImportTask.() -> Unit = {},
): CfnWirelessDeviceImportTask = CfnWirelessDeviceImportTask(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWirelessDeviceImportTask(id: String, initializer: @AwsCdkDsl
    CfnWirelessDeviceImportTask.Builder.() -> Unit = {}): CfnWirelessDeviceImportTask =
    CfnWirelessDeviceImportTask.Builder.create(this, id).apply(initializer).build()
