package com.faendir.awscdkkt.generated.services.opensearchserverless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnCollectionGroup
import software.amazon.awscdk.services.opensearchserverless.CfnCollectionGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCollectionGroup(
  id: String,
  props: CfnCollectionGroupProps,
  initializer: @AwsCdkDsl CfnCollectionGroup.() -> Unit = {},
): CfnCollectionGroup = CfnCollectionGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCollectionGroup(id: String, initializer: @AwsCdkDsl CfnCollectionGroup.Builder.() -> Unit = {}): CfnCollectionGroup = CfnCollectionGroup.Builder.create(this, id).apply(initializer).build()
