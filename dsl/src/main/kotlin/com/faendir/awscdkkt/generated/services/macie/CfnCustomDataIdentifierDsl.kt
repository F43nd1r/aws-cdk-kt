package com.faendir.awscdkkt.generated.services.macie

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnCustomDataIdentifier.() -> Unit = {},
): CfnCustomDataIdentifier = CfnCustomDataIdentifier(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomDataIdentifier(id: String, initializer: @AwsCdkDsl
    CfnCustomDataIdentifier.Builder.() -> Unit = {}): CfnCustomDataIdentifier =
    CfnCustomDataIdentifier.Builder.create(this, id).apply(initializer).build()
