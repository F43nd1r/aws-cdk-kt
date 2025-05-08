package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnDomainUnit
import software.amazon.awscdk.services.datazone.CfnDomainUnitProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomainUnit(
  id: String,
  props: CfnDomainUnitProps,
  initializer: @AwsCdkDsl CfnDomainUnit.() -> Unit = {},
): CfnDomainUnit = CfnDomainUnit(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDomainUnit(id: String, initializer: @AwsCdkDsl
    CfnDomainUnit.Builder.() -> Unit = {}): CfnDomainUnit = CfnDomainUnit.Builder.create(this,
    id).apply(initializer).build()
