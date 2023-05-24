package com.faendir.awscdkkt.generated.services.ssmcontacts

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnContact
import software.amazon.awscdk.services.ssmcontacts.CfnContactProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContact(id: String, props: CfnContactProps): CfnContact = CfnContact(this,
    id, props)

@Generated
public fun Construct.cfnContact(
  id: String,
  props: CfnContactProps,
  initializer: @AwsCdkDsl CfnContact.() -> Unit,
): CfnContact = CfnContact(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContact(id: String, initializer: @AwsCdkDsl
    CfnContact.Builder.() -> Unit): CfnContact = CfnContact.Builder.create(this,
    id).apply(initializer).build()
