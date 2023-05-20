@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnCidrCollection
import software.amazon.awscdk.services.route53.CfnCidrCollectionProps
import software.constructs.Construct

public fun Construct.cfnCidrCollection(
  id: String,
  props: CfnCidrCollectionProps,
  initializer: CfnCidrCollection.() -> Unit = {},
): CfnCidrCollection = CfnCidrCollection(this, id, props).apply(initializer)
