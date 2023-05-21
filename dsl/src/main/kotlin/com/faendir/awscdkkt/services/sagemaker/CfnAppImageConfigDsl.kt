package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAppImageConfig(
  id: String,
  props: CfnAppImageConfigProps,
  initializer: CfnAppImageConfig.() -> Unit = {},
): CfnAppImageConfig = CfnAppImageConfig(this, id, props).apply(initializer)
