package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFeatureGroup(
  id: String,
  props: CfnFeatureGroupProps,
  initializer: CfnFeatureGroup.() -> Unit = {},
): CfnFeatureGroup = CfnFeatureGroup(this, id, props).apply(initializer)
