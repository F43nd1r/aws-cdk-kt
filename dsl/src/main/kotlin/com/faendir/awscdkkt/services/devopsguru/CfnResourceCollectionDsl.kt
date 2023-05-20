@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.devopsguru

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection
import software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps
import software.constructs.Construct

public fun Construct.cfnResourceCollection(
  id: String,
  props: CfnResourceCollectionProps,
  initializer: CfnResourceCollection.() -> Unit = {},
): CfnResourceCollection = CfnResourceCollection(this, id, props).apply(initializer)
