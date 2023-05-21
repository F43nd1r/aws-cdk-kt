package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions

@Generated
public fun ebsDeviceSnapshotOptions(initializer: EbsDeviceSnapshotOptions.Builder.() -> Unit = {}):
    EbsDeviceSnapshotOptions = EbsDeviceSnapshotOptions.builder().apply(initializer).build()
