@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnImageVersion
import software.amazon.awscdk.services.sagemaker.CfnImageVersionProps
import software.constructs.Construct

public fun Construct.cfnImageVersion(
  id: String,
  props: CfnImageVersionProps,
  initializer: CfnImageVersion.() -> Unit = {},
): CfnImageVersion = CfnImageVersion(this, id, props).apply(initializer)
