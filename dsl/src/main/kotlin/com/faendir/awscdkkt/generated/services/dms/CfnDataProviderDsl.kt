package com.faendir.awscdkkt.generated.services.dms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnDataProvider
import software.amazon.awscdk.services.dms.CfnDataProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataProvider(
  id: String,
  props: CfnDataProviderProps,
  initializer: @AwsCdkDsl CfnDataProvider.() -> Unit = {},
): CfnDataProvider = CfnDataProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataProvider(id: String, initializer: @AwsCdkDsl
    CfnDataProvider.Builder.() -> Unit = {}): CfnDataProvider = CfnDataProvider.Builder.create(this,
    id).apply(initializer).build()
