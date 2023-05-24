package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.IRepository
import software.amazon.awscdk.services.lambda.EcrImageCode
import software.amazon.awscdk.services.lambda.EcrImageCodeProps

@Generated
public fun ecrImageCode(repository: IRepository): EcrImageCode = EcrImageCode(repository)

@Generated
public fun ecrImageCode(repository: IRepository, props: EcrImageCodeProps): EcrImageCode =
    EcrImageCode(repository, props)

@Generated
public fun buildEcrImageCode(repository: IRepository, initializer: @AwsCdkDsl
    EcrImageCode.Builder.() -> Unit): EcrImageCode =
    EcrImageCode.Builder.create(repository).apply(initializer).build()
