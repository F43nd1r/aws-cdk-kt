package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnArchive
import software.amazon.awscdk.services.events.CfnArchiveProps
import software.constructs.Construct

@Generated
public fun Construct.cfnArchive(id: String, props: CfnArchiveProps): CfnArchive = CfnArchive(this,
    id, props)

@Generated
public fun Construct.cfnArchive(
  id: String,
  props: CfnArchiveProps,
  initializer: @AwsCdkDsl CfnArchive.() -> Unit,
): CfnArchive = CfnArchive(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnArchive(id: String, initializer: @AwsCdkDsl
    CfnArchive.Builder.() -> Unit): CfnArchive = CfnArchive.Builder.create(this,
    id).apply(initializer).build()
