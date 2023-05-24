package com.faendir.awscdkkt.generated

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.ValidationResult
import software.amazon.awscdk.ValidationResults

@Generated
public fun validationResult(): ValidationResult = ValidationResult()

@Generated
public fun validationResult(errorMessage: String): ValidationResult = ValidationResult(errorMessage)

@Generated
public fun validationResult(errorMessage: String, results: ValidationResults): ValidationResult =
    ValidationResult(errorMessage, results)
