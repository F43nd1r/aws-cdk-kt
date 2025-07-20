package com.faendir.awscdkkt.generated.services.cleanrooms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnCollaboration
import software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCollaboration(
  id: String,
  props: CfnCollaborationProps,
  initializer: @AwsCdkDsl CfnCollaboration.() -> Unit = {},
): CfnCollaboration = CfnCollaboration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCollaboration(id: String, initializer: @AwsCdkDsl CfnCollaboration.Builder.() -> Unit = {}): CfnCollaboration = CfnCollaboration.Builder.create(this, id).apply(initializer).build()
