package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnMailManagerArchive
import software.amazon.awscdk.services.ses.CfnMailManagerArchiveProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMailManagerArchive(id: String, initializer: @AwsCdkDsl
    CfnMailManagerArchive.() -> Unit = {}): CfnMailManagerArchive = CfnMailManagerArchive(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnMailManagerArchive(
  id: String,
  props: CfnMailManagerArchiveProps,
  initializer: @AwsCdkDsl CfnMailManagerArchive.() -> Unit = {},
): CfnMailManagerArchive = CfnMailManagerArchive(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMailManagerArchive(id: String, initializer: @AwsCdkDsl
    CfnMailManagerArchive.Builder.() -> Unit = {}): CfnMailManagerArchive =
    CfnMailManagerArchive.Builder.create(this, id).apply(initializer).build()
