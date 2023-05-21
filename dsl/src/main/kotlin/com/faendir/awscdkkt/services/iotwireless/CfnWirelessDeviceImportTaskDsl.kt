package com.faendir.awscdkkt.services.iotwireless

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
  initializer: CfnWirelessDeviceImportTask.() -> Unit = {},
): CfnWirelessDeviceImportTask = CfnWirelessDeviceImportTask(this, id, props).apply(initializer)
