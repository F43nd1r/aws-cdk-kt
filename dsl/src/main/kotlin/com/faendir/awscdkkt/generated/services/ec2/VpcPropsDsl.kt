package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpcProps

@Generated
public fun buildVpcProps(initializer: @AwsCdkDsl VpcProps.Builder.() -> Unit = {}): VpcProps =
    VpcProps.Builder().apply(initializer).build()
