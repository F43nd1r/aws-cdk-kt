@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnCollection
import software.amazon.awscdk.services.rekognition.CfnCollectionProps
import software.constructs.Construct

public fun Construct.cfnCollection(
  id: String,
  props: CfnCollectionProps,
  initializer: CfnCollection.() -> Unit = {},
): CfnCollection = CfnCollection(this, id, props).apply(initializer)
