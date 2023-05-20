@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifier
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps
import software.constructs.Construct

public fun Construct.cfnCustomDataIdentifier(
  id: String,
  props: CfnCustomDataIdentifierProps,
  initializer: CfnCustomDataIdentifier.() -> Unit = {},
): CfnCustomDataIdentifier = CfnCustomDataIdentifier(this, id, props).apply(initializer)
