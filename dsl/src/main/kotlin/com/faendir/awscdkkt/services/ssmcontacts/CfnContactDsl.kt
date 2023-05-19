@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
