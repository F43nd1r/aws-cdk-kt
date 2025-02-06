package com.faendir.awscdkkt.generated.services.notifications

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation
import software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnManagedNotificationAdditionalChannelAssociation(
  id: String,
  props: CfnManagedNotificationAdditionalChannelAssociationProps,
  initializer: @AwsCdkDsl CfnManagedNotificationAdditionalChannelAssociation.() -> Unit = {},
): CfnManagedNotificationAdditionalChannelAssociation =
    CfnManagedNotificationAdditionalChannelAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnManagedNotificationAdditionalChannelAssociation(id: String,
    initializer: @AwsCdkDsl CfnManagedNotificationAdditionalChannelAssociation.Builder.() -> Unit =
    {}): CfnManagedNotificationAdditionalChannelAssociation =
    CfnManagedNotificationAdditionalChannelAssociation.Builder.create(this,
    id).apply(initializer).build()
