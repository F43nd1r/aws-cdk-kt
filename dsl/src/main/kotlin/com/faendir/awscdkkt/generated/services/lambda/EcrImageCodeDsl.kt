package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.IRepository
import software.amazon.awscdk.services.lambda.EcrImageCode

@Generated
public fun buildEcrImageCode(repository: IRepository, initializer: @AwsCdkDsl
    EcrImageCode.Builder.() -> Unit): EcrImageCode =
    EcrImageCode.Builder.create(repository).apply(initializer).build()
