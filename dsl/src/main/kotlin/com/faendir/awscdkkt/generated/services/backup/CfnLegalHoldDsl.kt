package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnLegalHold
import software.amazon.awscdk.services.backup.CfnLegalHoldProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLegalHold(
  id: String,
  props: CfnLegalHoldProps,
  initializer: @AwsCdkDsl CfnLegalHold.() -> Unit = {},
): CfnLegalHold = CfnLegalHold(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLegalHold(id: String, initializer: @AwsCdkDsl CfnLegalHold.Builder.() -> Unit = {}): CfnLegalHold = CfnLegalHold.Builder.create(this, id).apply(initializer).build()
