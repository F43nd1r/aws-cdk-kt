@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
