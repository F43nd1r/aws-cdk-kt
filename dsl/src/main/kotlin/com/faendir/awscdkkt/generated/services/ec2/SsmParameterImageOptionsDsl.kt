package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SsmParameterImageOptions

@Generated
public fun buildSsmParameterImageOptions(initializer: @AwsCdkDsl
    SsmParameterImageOptions.Builder.() -> Unit = {}): SsmParameterImageOptions =
    SsmParameterImageOptions.Builder().apply(initializer).build()
