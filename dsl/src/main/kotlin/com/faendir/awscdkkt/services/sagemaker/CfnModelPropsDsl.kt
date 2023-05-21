package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelProps

@Generated
public fun cfnModelProps(initializer: CfnModelProps.Builder.() -> Unit = {}): CfnModelProps =
    CfnModelProps.builder().apply(initializer).build()
