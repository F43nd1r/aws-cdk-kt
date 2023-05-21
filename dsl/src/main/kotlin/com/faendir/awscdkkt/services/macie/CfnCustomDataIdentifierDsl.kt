package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifier
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomDataIdentifier(
  id: String,
  props: CfnCustomDataIdentifierProps,
  initializer: CfnCustomDataIdentifier.() -> Unit = {},
): CfnCustomDataIdentifier = CfnCustomDataIdentifier(this, id, props).apply(initializer)
