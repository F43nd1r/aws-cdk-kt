package com.faendir.awscdkkt.generated.services.notificationscontacts

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.notificationscontacts.CfnEmailContact
import software.amazon.awscdk.services.notificationscontacts.CfnEmailContactProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEmailContact(
  id: String,
  props: CfnEmailContactProps,
  initializer: @AwsCdkDsl CfnEmailContact.() -> Unit = {},
): CfnEmailContact = CfnEmailContact(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEmailContact(id: String, initializer: @AwsCdkDsl CfnEmailContact.Builder.() -> Unit = {}): CfnEmailContact = CfnEmailContact.Builder.create(this, id).apply(initializer).build()
