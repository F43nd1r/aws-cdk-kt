package com.faendir.awscdkkt.generated.services.s3tables

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3tables.CfnNamespace
import software.amazon.awscdk.services.s3tables.CfnNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNamespace(
  id: String,
  props: CfnNamespaceProps,
  initializer: @AwsCdkDsl CfnNamespace.() -> Unit = {},
): CfnNamespace = CfnNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNamespace(id: String, initializer: @AwsCdkDsl CfnNamespace.Builder.() -> Unit = {}): CfnNamespace = CfnNamespace.Builder.create(this, id).apply(initializer).build()
