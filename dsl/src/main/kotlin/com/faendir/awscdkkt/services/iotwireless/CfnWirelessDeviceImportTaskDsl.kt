@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps
import software.constructs.Construct

public fun Construct.cfnWirelessDeviceImportTask(
  id: String,
  props: CfnWirelessDeviceImportTaskProps,
  initializer: CfnWirelessDeviceImportTask.() -> Unit = {},
): CfnWirelessDeviceImportTask = CfnWirelessDeviceImportTask(this, id, props).apply(initializer)
