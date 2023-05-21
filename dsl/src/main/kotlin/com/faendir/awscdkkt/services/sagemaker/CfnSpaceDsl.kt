package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnSpace
import software.amazon.awscdk.services.sagemaker.CfnSpaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSpace(
  id: String,
  props: CfnSpaceProps,
  initializer: CfnSpace.() -> Unit = {},
): CfnSpace = CfnSpace(this, id, props).apply(initializer)
