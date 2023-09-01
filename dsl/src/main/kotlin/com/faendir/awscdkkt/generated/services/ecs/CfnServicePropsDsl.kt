package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnServiceProps

@Generated
public fun buildCfnServiceProps(initializer: @AwsCdkDsl CfnServiceProps.Builder.() -> Unit = {}):
    CfnServiceProps = CfnServiceProps.Builder().apply(initializer).build()
