package com.faendir.awscdkkt.services.opensearchserverless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnCollection
import software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCollection(
  id: String,
  props: CfnCollectionProps,
  initializer: CfnCollection.() -> Unit = {},
): CfnCollection = CfnCollection(this, id, props).apply(initializer)
