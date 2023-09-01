package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens
import software.amazon.awscdk.services.s3.CfnStorageLensProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStorageLens(
  id: String,
  props: CfnStorageLensProps,
  initializer: @AwsCdkDsl CfnStorageLens.() -> Unit = {},
): CfnStorageLens = CfnStorageLens(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStorageLens(id: String, initializer: @AwsCdkDsl
    CfnStorageLens.Builder.() -> Unit = {}): CfnStorageLens = CfnStorageLens.Builder.create(this,
    id).apply(initializer).build()
