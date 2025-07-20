package com.faendir.awscdkkt.generated.services.notifications

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation
import software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnManagedNotificationAccountContactAssociation(
  id: String,
  props: CfnManagedNotificationAccountContactAssociationProps,
  initializer: @AwsCdkDsl CfnManagedNotificationAccountContactAssociation.() -> Unit = {},
): CfnManagedNotificationAccountContactAssociation = CfnManagedNotificationAccountContactAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnManagedNotificationAccountContactAssociation(id: String, initializer: @AwsCdkDsl CfnManagedNotificationAccountContactAssociation.Builder.() -> Unit = {}): CfnManagedNotificationAccountContactAssociation = CfnManagedNotificationAccountContactAssociation.Builder.create(this, id).apply(initializer).build()
