@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
