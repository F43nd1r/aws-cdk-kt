@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps
import software.constructs.Construct

public fun Construct.cfnAppImageConfig(
  id: String,
  props: CfnAppImageConfigProps,
  initializer: CfnAppImageConfig.() -> Unit = {},
): CfnAppImageConfig = CfnAppImageConfig(this, id, props).apply(initializer)
