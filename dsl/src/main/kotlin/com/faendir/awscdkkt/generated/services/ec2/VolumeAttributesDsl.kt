package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VolumeAttributes

@Generated
public fun buildVolumeAttributes(initializer: @AwsCdkDsl VolumeAttributes.Builder.() -> Unit):
    VolumeAttributes = VolumeAttributes.Builder().apply(initializer).build()
