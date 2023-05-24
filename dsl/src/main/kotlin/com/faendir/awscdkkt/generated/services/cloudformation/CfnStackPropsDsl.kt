package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackProps

@Generated
public fun buildCfnStackProps(initializer: @AwsCdkDsl CfnStackProps.Builder.() -> Unit):
    CfnStackProps = CfnStackProps.Builder().apply(initializer).build()
