package com.faendir.awscdkkt.generated.services.qldb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnLedger
import software.amazon.awscdk.services.qldb.CfnLedgerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLedger(
  id: String,
  props: CfnLedgerProps,
  initializer: @AwsCdkDsl CfnLedger.() -> Unit = {},
): CfnLedger = CfnLedger(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLedger(id: String, initializer: @AwsCdkDsl CfnLedger.Builder.() -> Unit = {}): CfnLedger = CfnLedger.Builder.create(this, id).apply(initializer).build()
