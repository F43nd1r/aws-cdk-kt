package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnContact
import software.amazon.awscdk.services.ssmcontacts.CfnContactProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContact(
  id: String,
  props: CfnContactProps,
  initializer: CfnContact.() -> Unit = {},
): CfnContact = CfnContact(this, id, props).apply(initializer)
