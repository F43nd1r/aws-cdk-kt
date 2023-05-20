@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnFeature
import software.amazon.awscdk.services.evidently.CfnFeatureProps
import software.constructs.Construct

public fun Construct.cfnFeature(
  id: String,
  props: CfnFeatureProps,
  initializer: CfnFeature.() -> Unit = {},
): CfnFeature = CfnFeature(this, id, props).apply(initializer)
