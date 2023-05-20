@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnContact
import software.amazon.awscdk.services.ssmcontacts.CfnContactProps
import software.constructs.Construct

public fun Construct.cfnContact(
  id: String,
  props: CfnContactProps,
  initializer: CfnContact.() -> Unit = {},
): CfnContact = CfnContact(this, id, props).apply(initializer)
