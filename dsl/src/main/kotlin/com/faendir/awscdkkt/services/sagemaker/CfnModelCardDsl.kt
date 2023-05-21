package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import software.amazon.awscdk.services.sagemaker.CfnModelCardProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelCard(
  id: String,
  props: CfnModelCardProps,
  initializer: CfnModelCard.() -> Unit = {},
): CfnModelCard = CfnModelCard(this, id, props).apply(initializer)
