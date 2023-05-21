package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions

@Generated
public fun ebsDeviceSnapshotOptions(initializer: EbsDeviceSnapshotOptions.Builder.() -> Unit = {}):
    EbsDeviceSnapshotOptions = EbsDeviceSnapshotOptions.builder().apply(initializer).build()
