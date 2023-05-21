package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppProps

@Generated
public fun cfnAppProps(initializer: CfnAppProps.Builder.() -> Unit = {}): CfnAppProps =
    CfnAppProps.builder().apply(initializer).build()
