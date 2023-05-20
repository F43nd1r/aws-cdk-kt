@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModel
import software.amazon.awscdk.services.sagemaker.CfnModelProps
import software.constructs.Construct

public fun Construct.cfnModel(
  id: String,
  props: CfnModelProps,
  initializer: CfnModel.() -> Unit = {},
): CfnModel = CfnModel(this, id, props).apply(initializer)
