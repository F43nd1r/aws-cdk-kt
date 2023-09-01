package com.faendir.awscdkkt.generated.services.opensearchserverless

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnCollection.() -> Unit = {},
): CfnCollection = CfnCollection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCollection(id: String, initializer: @AwsCdkDsl
    CfnCollection.Builder.() -> Unit = {}): CfnCollection = CfnCollection.Builder.create(this,
    id).apply(initializer).build()
