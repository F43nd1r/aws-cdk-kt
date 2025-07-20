package com.faendir.awscdkkt.generated.services.notifications

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.notifications.CfnChannelAssociation
import software.amazon.awscdk.services.notifications.CfnChannelAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnChannelAssociation(
  id: String,
  props: CfnChannelAssociationProps,
  initializer: @AwsCdkDsl CfnChannelAssociation.() -> Unit = {},
): CfnChannelAssociation = CfnChannelAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnChannelAssociation(id: String, initializer: @AwsCdkDsl CfnChannelAssociation.Builder.() -> Unit = {}): CfnChannelAssociation = CfnChannelAssociation.Builder.create(this, id).apply(initializer).build()
