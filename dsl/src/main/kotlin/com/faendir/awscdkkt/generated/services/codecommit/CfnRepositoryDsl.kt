package com.faendir.awscdkkt.generated.services.codecommit

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.CfnRepositoryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRepository(
  id: String,
  props: CfnRepositoryProps,
  initializer: @AwsCdkDsl CfnRepository.() -> Unit = {},
): CfnRepository = CfnRepository(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRepository(id: String, initializer: @AwsCdkDsl
    CfnRepository.Builder.() -> Unit = {}): CfnRepository = CfnRepository.Builder.create(this,
    id).apply(initializer).build()
