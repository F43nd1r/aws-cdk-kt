package com.faendir.awscdkkt.generated.services.opensearchserverless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnCollectionIndex
import software.amazon.awscdk.services.opensearchserverless.CfnCollectionIndexProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCollectionIndex(
  id: String,
  props: CfnCollectionIndexProps,
  initializer: @AwsCdkDsl CfnCollectionIndex.() -> Unit = {},
): CfnCollectionIndex = CfnCollectionIndex(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCollectionIndex(id: String, initializer: @AwsCdkDsl CfnCollectionIndex.Builder.() -> Unit = {}): CfnCollectionIndex = CfnCollectionIndex.Builder.create(this, id).apply(initializer).build()
